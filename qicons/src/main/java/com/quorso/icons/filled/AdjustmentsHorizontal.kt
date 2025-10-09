package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.AdjustmentsHorizontal: ImageVector
    get() {
        if (_AdjustmentsHorizontal != null) {
            return _AdjustmentsHorizontal!!
        }
        _AdjustmentsHorizontal = ImageVector.Builder(
            name = "Filled.AdjustmentsHorizontal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.75f, 12.75f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                close()
                moveTo(12f, 6f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                horizontalLineToRelative(7.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineToRelative(-7.5f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 6f)
                close()
                moveTo(12f, 18f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                horizontalLineToRelative(7.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineToRelative(-7.5f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 18f)
                close()
                moveTo(3.75f, 6.75f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -1.5f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                close()
                moveTo(5.25f, 18.75f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                close()
                moveTo(3f, 12f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                horizontalLineToRelative(7.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineToRelative(-7.5f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 12f)
                close()
                moveTo(9f, 3.75f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 4.5f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4.5f)
                close()
                moveTo(12.75f, 12f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4.5f, 0f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.5f, 0f)
                close()
                moveTo(9f, 15.75f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 4.5f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4.5f)
                close()
            }
        }.build()

        return _AdjustmentsHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _AdjustmentsHorizontal: ImageVector? = null
