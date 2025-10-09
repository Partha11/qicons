package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.RectangleGroup: ImageVector
    get() {
        if (_RectangleGroup != null) {
            return _RectangleGroup!!
        }
        _RectangleGroup = ImageVector.Builder(
            name = "Outlined.RectangleGroup",
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
                moveTo(2.25f, 7.125f)
                curveTo(2.25f, 6.504f, 2.754f, 6f, 3.375f, 6f)
                horizontalLineToRelative(6f)
                curveToRelative(0.621f, 0f, 1.125f, 0.504f, 1.125f, 1.125f)
                verticalLineToRelative(3.75f)
                curveToRelative(0f, 0.621f, -0.504f, 1.125f, -1.125f, 1.125f)
                horizontalLineToRelative(-6f)
                arcToRelative(1.125f, 1.125f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.125f, -1.125f)
                verticalLineToRelative(-3.75f)
                close()
                moveTo(14.25f, 8.625f)
                curveToRelative(0f, -0.621f, 0.504f, -1.125f, 1.125f, -1.125f)
                horizontalLineToRelative(5.25f)
                curveToRelative(0.621f, 0f, 1.125f, 0.504f, 1.125f, 1.125f)
                verticalLineToRelative(8.25f)
                curveToRelative(0f, 0.621f, -0.504f, 1.125f, -1.125f, 1.125f)
                horizontalLineToRelative(-5.25f)
                arcToRelative(1.125f, 1.125f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.125f, -1.125f)
                verticalLineToRelative(-8.25f)
                close()
                moveTo(3.75f, 16.125f)
                curveToRelative(0f, -0.621f, 0.504f, -1.125f, 1.125f, -1.125f)
                horizontalLineToRelative(5.25f)
                curveToRelative(0.621f, 0f, 1.125f, 0.504f, 1.125f, 1.125f)
                verticalLineToRelative(2.25f)
                curveToRelative(0f, 0.621f, -0.504f, 1.125f, -1.125f, 1.125f)
                horizontalLineToRelative(-5.25f)
                arcToRelative(1.125f, 1.125f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.125f, -1.125f)
                verticalLineToRelative(-2.25f)
                close()
            }
        }.build()

        return _RectangleGroup!!
    }

@Suppress("ObjectPropertyName")
private var _RectangleGroup: ImageVector? = null
