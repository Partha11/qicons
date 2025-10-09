package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.Newspaper: ImageVector
    get() {
        if (_Newspaper != null) {
            return _Newspaper!!
        }
        _Newspaper = ImageVector.Builder(
            name = "Outlined.Newspaper",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 7.5f)
                horizontalLineToRelative(1.5f)
                moveToRelative(-1.5f, 3f)
                horizontalLineToRelative(1.5f)
                moveToRelative(-7.5f, 3f)
                horizontalLineToRelative(7.5f)
                moveToRelative(-7.5f, 3f)
                horizontalLineToRelative(7.5f)
                moveToRelative(3f, -9f)
                horizontalLineToRelative(3.375f)
                curveToRelative(0.621f, 0f, 1.125f, 0.504f, 1.125f, 1.125f)
                verticalLineTo(18f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.25f, 2.25f)
                moveTo(16.5f, 7.5f)
                verticalLineTo(18f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.25f, 2.25f)
                moveTo(16.5f, 7.5f)
                verticalLineTo(4.875f)
                curveToRelative(0f, -0.621f, -0.504f, -1.125f, -1.125f, -1.125f)
                horizontalLineTo(4.125f)
                curveTo(3.504f, 3.75f, 3f, 4.254f, 3f, 4.875f)
                verticalLineTo(18f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.25f, 2.25f)
                horizontalLineToRelative(13.5f)
                moveTo(6f, 7.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineTo(6f)
                verticalLineToRelative(-3f)
                close()
            }
        }.build()

        return _Newspaper!!
    }

@Suppress("ObjectPropertyName")
private var _Newspaper: ImageVector? = null
