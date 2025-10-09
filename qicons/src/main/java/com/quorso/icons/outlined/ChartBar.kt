package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.ChartBar: ImageVector
    get() {
        if (_ChartBar != null) {
            return _ChartBar!!
        }
        _ChartBar = ImageVector.Builder(
            name = "Outlined.ChartBar",
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
                moveTo(3f, 13.125f)
                curveTo(3f, 12.504f, 3.504f, 12f, 4.125f, 12f)
                horizontalLineToRelative(2.25f)
                curveToRelative(0.621f, 0f, 1.125f, 0.504f, 1.125f, 1.125f)
                verticalLineToRelative(6.75f)
                curveTo(7.5f, 20.496f, 6.996f, 21f, 6.375f, 21f)
                horizontalLineToRelative(-2.25f)
                arcTo(1.125f, 1.125f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 19.875f)
                verticalLineToRelative(-6.75f)
                close()
                moveTo(9.75f, 8.625f)
                curveToRelative(0f, -0.621f, 0.504f, -1.125f, 1.125f, -1.125f)
                horizontalLineToRelative(2.25f)
                curveToRelative(0.621f, 0f, 1.125f, 0.504f, 1.125f, 1.125f)
                verticalLineToRelative(11.25f)
                curveToRelative(0f, 0.621f, -0.504f, 1.125f, -1.125f, 1.125f)
                horizontalLineToRelative(-2.25f)
                arcToRelative(1.125f, 1.125f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.125f, -1.125f)
                verticalLineTo(8.625f)
                close()
                moveTo(16.5f, 4.125f)
                curveToRelative(0f, -0.621f, 0.504f, -1.125f, 1.125f, -1.125f)
                horizontalLineToRelative(2.25f)
                curveTo(20.496f, 3f, 21f, 3.504f, 21f, 4.125f)
                verticalLineToRelative(15.75f)
                curveToRelative(0f, 0.621f, -0.504f, 1.125f, -1.125f, 1.125f)
                horizontalLineToRelative(-2.25f)
                arcToRelative(1.125f, 1.125f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.125f, -1.125f)
                verticalLineTo(4.125f)
                close()
            }
        }.build()

        return _ChartBar!!
    }

@Suppress("ObjectPropertyName")
private var _ChartBar: ImageVector? = null
