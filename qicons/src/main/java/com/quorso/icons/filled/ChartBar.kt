package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.ChartBar: ImageVector
    get() {
        if (_ChartBar != null) {
            return _ChartBar!!
        }
        _ChartBar = ImageVector.Builder(
            name = "Filled.ChartBar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.375f, 2.25f)
                curveToRelative(-1.035f, 0f, -1.875f, 0.84f, -1.875f, 1.875f)
                verticalLineToRelative(15.75f)
                curveToRelative(0f, 1.035f, 0.84f, 1.875f, 1.875f, 1.875f)
                horizontalLineToRelative(0.75f)
                curveToRelative(1.035f, 0f, 1.875f, -0.84f, 1.875f, -1.875f)
                verticalLineTo(4.125f)
                curveToRelative(0f, -1.036f, -0.84f, -1.875f, -1.875f, -1.875f)
                horizontalLineToRelative(-0.75f)
                close()
                moveTo(9.75f, 8.625f)
                curveToRelative(0f, -1.036f, 0.84f, -1.875f, 1.875f, -1.875f)
                horizontalLineToRelative(0.75f)
                curveToRelative(1.036f, 0f, 1.875f, 0.84f, 1.875f, 1.875f)
                verticalLineToRelative(11.25f)
                curveToRelative(0f, 1.035f, -0.84f, 1.875f, -1.875f, 1.875f)
                horizontalLineToRelative(-0.75f)
                arcToRelative(1.875f, 1.875f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.875f, -1.875f)
                verticalLineTo(8.625f)
                close()
                moveTo(3f, 13.125f)
                curveToRelative(0f, -1.036f, 0.84f, -1.875f, 1.875f, -1.875f)
                horizontalLineToRelative(0.75f)
                curveToRelative(1.036f, 0f, 1.875f, 0.84f, 1.875f, 1.875f)
                verticalLineToRelative(6.75f)
                curveToRelative(0f, 1.035f, -0.84f, 1.875f, -1.875f, 1.875f)
                horizontalLineToRelative(-0.75f)
                arcTo(1.875f, 1.875f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 19.875f)
                verticalLineToRelative(-6.75f)
                close()
            }
        }.build()

        return _ChartBar!!
    }

@Suppress("ObjectPropertyName")
private var _ChartBar: ImageVector? = null
