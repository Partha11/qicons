package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.Battery100: ImageVector
    get() {
        if (_Battery100 != null) {
            return _Battery100!!
        }
        _Battery100 = ImageVector.Builder(
            name = "Outlined.Battery100",
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
                moveTo(21f, 10.5f)
                horizontalLineToRelative(0.375f)
                curveToRelative(0.621f, 0f, 1.125f, 0.504f, 1.125f, 1.125f)
                verticalLineToRelative(2.25f)
                curveToRelative(0f, 0.621f, -0.504f, 1.125f, -1.125f, 1.125f)
                horizontalLineTo(21f)
                moveTo(4.5f, 10.5f)
                horizontalLineTo(18f)
                verticalLineTo(15f)
                horizontalLineTo(4.5f)
                verticalLineToRelative(-4.5f)
                close()
                moveTo(3.75f, 18f)
                horizontalLineToRelative(15f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 15.75f)
                verticalLineToRelative(-6f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.25f, -2.25f)
                horizontalLineToRelative(-15f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 9.75f)
                verticalLineToRelative(6f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.75f, 18f)
                close()
            }
        }.build()

        return _Battery100!!
    }

@Suppress("ObjectPropertyName")
private var _Battery100: ImageVector? = null
